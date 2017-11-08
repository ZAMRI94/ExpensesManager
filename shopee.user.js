var host = window.location.hostname;
if(host == "shopee.com.my" || host == "www.shopee.com.my") {
	var cart = "shopee.com.my/cart";
	var buttonId = "";
	var link = "https://shopee.com.my/100--authentic-molten-gg7x-fiba-basketball-new-official-7-i.12876757.96936411"
	var checkout ="shopee.com.my/buyer/w/checkout";
	var getUser = null;
	if(window.location.href == link) {
		var success = false;
		var timer = setInterval(function() {
			if(document.getElementsByClassName('shopee-product-info-body__variation').length > 0){
				clearInterval(timer);
				var variation = document.getElementsByClassName('shopee-product-info-body__variation');
				for(i=0;i<variation.length;i++){
					console.log(i);
					if(variation[i].innerText.toLowerCase().includes("gg7x")){
						variation[i].click();
						if(document.getElementsByClassName('shopee-product-info__header__real-price')[0].innerText.includes('11')){
							console.log('contain 11');
							document.getElementsByClassName('shopee-button-solid shopee-button-solid--primary btn-buynow')[0].click();
							sucess=true;
							i = variation.length;
							var x = 0;
							var secondtimer = setInterval(function(){
								if(document.getElementsByClassName('shopee-cart-page-footer__checkout-text').length>0){
									if(x >2) {
										clearInterval(secondtimer);
										document.getElementsByClassName('shopee-cart-page-footer__checkout-text')[0].click();
									}	
									x++;
								}
							},200);
						}
					}
				}
				
				if(i == variation.length && success==false) {
					window.location.href = link;
				}
			}
			
		},200);
	}
	//Inside the cart
	else if (window.location.href.includes(cart)) {
		var timer = setInterval(function () {
			if(document.getElementsByClassName('shopee-cart-page-footer__checkout-text').length>0){
				clearInterval(timer);
				document.getElementsByClassName('shopee-cart-page-footer__checkout-text')[0].click();
			}
		},100);
	}
	else if (window.location.href.includes(checkout)) {
		var timer = setInterval(function () {
			if(document.getElementsByClassName('btn-bottom r14 nav_btn btn-place check-out').length>0){
				clearInterval(timer);
				document.getElementsByClassName('btn-bottom r14 nav_btn btn-place check-out')[0].click();
			}
		},100);
	}
	else {
		window.location.href = link;
	}
	
}