function getIndex(){

	$(document).on("click", '#add', function(event){
		$('#addModalScrollable').modal('show');
		$("#korisnici").show();
		$("#imeInput2").hide();
		$("#prezimeInput2").hide();
		$("#korImeInput2").hide();
		$("#lozinkaInput2").hide();
		$("#datumInput2").hide();
		$("#emailInput2").hide();
		$("#adresaInput2").hide();
		$("#nazivInput2").hide();
	});
	$(document).on("click", '#login1', function(event){
		$('#loginmodal').modal('show');
		$("#korisnickoime").show();
		$("#lozinka").show();
	});
	
	$(document).on("click", '#usersFields', function(event){
		if ($('#korisniciSelect').val() == 'KUPAC'){
		$("#imeInput2").show();
		$("#prezimeInput2").show();
		$("#korImeInput2").show();
		$("#lozinkaInput2").show();
		$("#datumInput2").hide();
		$("#emailInput2").hide();
		$("#adresaInput2").show();
		$("#nazivInput2").hide();
	} else {
		$("#imeInput2").show();
		$("#prezimeInput2").show();
		$("#korImeInput2").show();
		$("#lozinkaInput2").show();
		$("#datumInput2").show();
		$("#emailInput2").show();
		$("#adresaInput2").show();
		$("#nazivInput2").show();
	}
	event.preventDefault();
	});

	
	$(document).on("click", '#doAdd', function(event){
	var korisniciSelect = $('#korisniciSelect');
	var imeInput = $('#imeInput');
	var prezimeInput = $('#prezimeInput');
	var korImeInput = $('#korImeInput');
	var lozinkaInput = $('#lozinkaInput');
	var datumInput = $('#datumInput');
	var emailInput = $('#emailInput');
	var adresaInput = $('#adresaInput');
	var nazivInput = $('#nazivInput');
	
	var korisnici = korisniciSelect.val();
	var firstname = imeInput.val();
	var lastname = prezimeInput.val();
	var username = korImeInput.val();
	var password = lozinkaInput.val();
	var dateFrom = datumInput.val();
	var email = emailInput.val();
	var address = adresaInput.val();
	var name = nazivInput.val();
	
	console.log('userType: ' + korisnici);
	console.log('firstname:' + firstname);
	console.log('lastname:' + lastname);
	console.log('username:' + username);
	console.log('password:' + password);
	console.log('dateFrom:' + dateFrom);
	console.log('email:' + email);
	console.log('address:' + address);
	console.log('name:' + name);
	
	if ($('#korisniciSelect').val() == 'PRODAVAC'){
		if(firstname == "" || lastname == "" || username == "" || password == "" || dateFrom == "" || email == "" || address == "" || name == ""){
		alert(' Niste uneli sve potrebne podatke za registarciju kupca')
		return;
		$('#addModalScrollable').modal('hide');
		}
	} else {
		if(firstname == "" || lastname == "" || username == "" || password == "" ||  address == ""){
		alert(' Niste uneli sve potrebne podatke za registarciju prodavca')
		return;
		$('#addModalScrollable').modal('hide');
		}
	}
	

	var params = {
			'ime' : firstname,
			'prezime' : lastname,
			'korisnickoime' : username,
			'lozinka' : password,
			'tipKorisnika' : korisnici,
			'datumOd' : dateFrom,
			'email' : email,
			'adresa' : address,
			'naziv' : name
	}
	

	
	console.log(params);
	
	$.ajax({
		url : 'http://localhost:8080/delivery/korisnici/add',
		type:'POST',
		data: JSON.stringify(params),
		contentType:'application/json; charset=utf-8',
		dataType:'json',
		success:function(data){
			console.log('...')
			alert('Registracija je uspesna')
			imeInput.val("");
			prezimeInput.val("");
			korImeInput.val("");
			lozinkaInput.val("");
			datumInput.val("");
			emailInput.val("");
			adresaInput.val("");
			nazivInput.val("");
			$('#addModalScrollable').modal('hide');
		}
	});
		console.log('slanje poruke');
		event.preventDefault();
		return false;
	});


	$(document).on("click", '.addModalClose', function(event){
		$('#addModalScrollable').modal('hide');
	});

}