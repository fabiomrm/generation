let nome = document.querySelector("#nome");
let email = document.querySelector("#email");
let assunto = document.querySelector("#assunto");
let mapa = document.querySelector("#mapa");
let nomeOk = false;
let emailOk = false;
let assuntoOk = false;

function validaNome() {
  let txtNome = document.querySelector("#txtNome");
  if (nome.value.length < 3) {
    txtNome.innerHTML = "Nome inválido";
    txtNome.style.color = "#f00";
  } else {
    txtNome.innerHTML = "Nome válido";
    txtNome.style.color = "#0f0";
  }
}

function validaEmail() {
  let txtEmail = document.querySelector("#txtEmail");

  if (email.value.indexOf("@") === -1) {
    txtEmail.innerHTML = "Email inválido";
    txtEmail.style.color = "#f00";
  } else {
    txtEmail.innerHTML = "Email válido";
    txtEmail.style.color = "#0f0";
  }
}

function validaAssunto() {
  let txtAssunto = document.querySelector("#txtAssunto");

  if (assunto.value.length > 100) {
    txtAssunto.innerHTML =
      "Texto muito grande. Digite no máximo 100 caracteres";

    txtAssunto.style.color = "#f00";
    txtAssunto.style.display = "block";
  } else {
    txtAssunto.style.display = "none";
  }
}

function enviar() {
  if (nomeOk && emailOk && assuntoOk) {
    alert("Formulário enviado com sucesso!");
  } else {
    alert("Preencha formulário corretamente");
  }
}

function zoomMapa() {
  mapa.style.width = "250px";
  mapa.style.height = "250px";
}

function normalMapa() {
  mapa.style.width = "200px";
  mapa.style.height = "200px";
}
