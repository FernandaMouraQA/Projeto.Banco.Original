#Author: fernandinha.crystal@gmail.com

@regressivo @enviarformulario
Feature: Enviar formulario de abertura de conta 
Eu como usuario quero enviar o formulario de abertura de conta para abrir uma nova conta

 Background: Acessar aplicacao
 Given que acesso o site "https:\\www.original.com.br"
 And acessar o formulario de abertura de conta 
 
  Scenario: Enviar formulario de abertura de conta 
  And preencher o campo nome " Teste Nome"
  And preencher o campo celular " (11)99151-5445 "
  And preencher o campo email " testes.testador@gmail.com "
  And preencher o campo cpf " 434.348.800-46 "
  When clicar no botao enviar
  Then formulario enviado com sucesso

 