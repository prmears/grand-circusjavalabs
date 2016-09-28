$(document).ready(function() {

	var shoppingcart = [];

	$('.add-button').click(function() {
		var item = $(this).parent();
		var price = item.children(".price").text();
		var name = item.children(".name").text();
		shoppingcart.push({name, price});
	});

	$('.finish-button').click(function() {
		var totalPrice = 0;
		var tempPrice = 0;
		for (var i = 0; i < shoppingcart.length; i++) {
			console.log(shoppingcart[i].name + " $ " + shoppingcart[i].price);
			totalPrice += parseFloat(shoppingcart[i].price);
		}
		console.log("Total cost: $ " + parseFloat(Math.round(totalPrice * 100) / 100).toFixed(2));
	});
});
