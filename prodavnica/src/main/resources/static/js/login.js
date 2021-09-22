const korisnik = localStorage.getItem("delivery-korisnik");
if(korisnik!=null || korisnik!=""){
  document.getElementById('menu').style.display="block";
  document.getElementById('logout').style.visibility = 'visible';
  document.getElementById('loginForm').style.display="none";
}else{
   document.getElementById('loginForm').style.display="visible";
  document.getElementById('logout').style.visibility = 'hidden';
}

document.getElementById("login").addEventListener('click',function (event)
{
    console.log('hehe');
    if(document.getElementById('korisnickoime').value == "" || document.getElementById('lozinka').value ==""){
        alert("Molimo Vas, popunite sve podatke!");
        return;
    }
    var korisnik = {
        korisnickoime: document.getElementById('korisnickoime').value,
        lozinka: document.getElementById('lozinka').value,
        }
    fetch('http://localhost:8080/delivery/korisnici', {
    method: 'post',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    body: JSON.stringify(korisnik)
    }).then(res => res.json())
    .then(res => 
        {
            if(res!=null){
                console.log('this is response after login');
                document.getElementById('loginForm').style.display="none";
                document.getElementById('menu').style.display="block";
                localStorage.setItem("delivery-korisnik", document.getElementById('korisnickoime').value);
            }else{
                alert("Podaci nisu ispravni, pokusajte ponovo!");
            }
        }
    );
    event.preventDefault();
}  ); 

document.getElementById("logout").addEventListener('click',function (event){
    localStorage.removeItem("delivery-korisnik");
    document.getElementById('menu').style.display="none";
    document.getElementById('logout').style.visibility = 'hidden';
    document.getElementById('loginForm').style.display="block"; 
    event.preventDefault();     
})
