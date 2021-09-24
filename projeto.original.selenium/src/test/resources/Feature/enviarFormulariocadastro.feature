#Author: fernandinha.crystal@gmail.com

@regressivo @enviarformulario
Feature: Enviar formulario de abertura de conta 
Eu como usuario quero enviar o formulario de abertura de conta para abrir uma nova conta

 Background: Acessar aplicacao
 Given que acesso o site "https:\\www.original.com.br"
 And acessar o formulario de abertura de conta 
 
  Scenario: Enviar formulario de abertura de conta 
  And preencher o campo nome " Teste Nome"
  And preencher o campo celular "(11) 91514-9565"
  And preencher o campo email "teste@email.com.br"
  And preencher o campo cpf "867.882.500-65"
  When clicar no botao avancar
  Then formulario enviado com sucesso

 