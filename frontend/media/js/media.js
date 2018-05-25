function CalcularMedia(){

  var nac = new Array();
  var nac = [parseFloat(document.querySelector('#nac1').value.trim()),parseFloat(document.querySelector('#nac2').value.trim())];
  var am = parseFloat(document.querySelector('#am').value.trim()) * 0.3;
  var ps = parseFloat(document.querySelector('#ps').value.trim()) * 0.5;
  var menorNota = 10;
  var maiorNota = 0;
  var status = "";

  for (var i = 0; i < nac.length; i++) {
    if(nac[i] <= menorNota){
      menorNota = nac[i];
    }
    if(nac[i] >= maiorNota){
      maiorNota = nac[i];
    }
  }

  if(maiorNota < 0 || maiorNota > 10 || isNaN(maiorNota) || !maiorNota
  || am < 0 || am > 10 || !am || isNaN(am)
  || ps < 0 || ps > 10 || !ps || isNaN(ps)){
    alert("Preencha uma nota válida.");
  } else {

  var mediaNac = maiorNota * 0.2;
  var mediaSemestre = am + ps + mediaNac;

  if(mediaSemestre >= 6) {
		status = "APROVADO";
    document.getElementById('status').style.backgroundColor="#168e12";
    document.getElementById('status').style.color="#fff";
	} else if (mediaSemestre < 4) {
		status = "REPROVADO";
    document.getElementById('status').style.backgroundColor="#ce1602";
    document.getElementById('status').style.color="#fff";
	} else {
		status = "EXAME";
    document.getElementById('status').style.backgroundColor="#edcc28";
    document.getElementById('status').style.color="#fff";
  }

  document.querySelector('#notaNac').value = mediaNac.toFixed(1);
  document.querySelector("#notaAm").value = am.toFixed(1);
  document.querySelector('#notaPs').value = ps.toFixed(1);
  document.querySelector('#mediaSemestre').value = mediaSemestre.toFixed(1);
  document.querySelector('#status').value = status;
  }
}

var botao = document.querySelector('#calcular');
botao.addEventListener('click', CalcularMedia);
