# Android Fragment lifecycle

Sharing a basic code, but that can be very useful for those who are learning. Besides, it's always good to remember because, sometimes, the solutions to more complex problems are found in the most basic things.

![teste](https://github.com/DiegoLinks/basic-android-fragment-lifecycle/assets/36086232/25c000fb-4941-4673-9eb7-f190505f407b)

Despite being an email app, the content of the data, as can be seen from the images, has a very musical theme full of references. Relating studies/work to something you like can make these tasks much more enjoyable!

The experiment is a simple app simulating a data-modified email app where there are two screens. The first has an email list created in a Fragment. The second is a second Fragment that opens when clicking on one of the emails in the list. The entire lifecycle of the Fragment is captured by logging when navigating to the details screen and then back to the main screen. This lifecycle can be well explored when debugging the code.

![Captura de tela de 2023-05-09 18-37-18](https://github.com/DiegoLinks/basic-android-fragment-lifecycle/assets/36086232/e38812e8-c032-4f46-b672-b2a681e7f04e)

About the code:

The methods of each part of the cycle were called, adding log with the respective messages in each one of them. When going through each phase, the message is displayed in the log as shown in the image.
Glide was used to load the images and make the round cutout.
The simplest possible implementation of Jetpack Navigation was used to navigate between Fragments, in a single activity concept.
A basic color setting has been implemented so that the app supports dark mode.
Text and space dimensions have been standardized in a centralized file.
In addition, a very personalized content was added. The screen with the list of emails was inspired by Gmail.

An important note, as described this project aims to review and share basic knowledge, the recommendation to start a new project would be to use Jetpack Compose and not XML.

_Agora em português!_

# Ciclo de vida do Fragment android

Compartilhando um código básico, mas que pode ser muito útil para quem está aprendendo. Além do que é sempre bom relembrar porque, às vezes, as soluções para problemas mais complexos estão nas coisas mais básicas.

Apesar de ser um app de e-mail, o conteúdo dos dados como pode ser observado pelas imagens tem um tema bem musical cheio de referências. Relacionar os estudos/trabalho a algo que você gosta pode deixar essas tarefas bem mais agradáveis!

![teste](https://github.com/DiegoLinks/basic-android-fragment-lifecycle/assets/36086232/25c000fb-4941-4673-9eb7-f190505f407b)

O experimento é um app simples simulando um app de e-mails com dados mocados onde existem duas telas. A primeira tem uma lista de e-mails criada em um Fragment. A segunda é um segundo Fragment que é aberto ao se clicar em um dos e-mails da lista. Todo o ciclo de vida do Fragment é capturado por log ao fazer a navegação indo até a tela de detalhes e depois voltando à tela principal. Esse ciclo de vida pode ser bem explorado ao debugar o código.

![Captura de tela de 2023-05-09 18-37-18](https://github.com/DiegoLinks/basic-android-fragment-lifecycle/assets/36086232/e38812e8-c032-4f46-b672-b2a681e7f04e)

Sobre o código:

Foram chamados os métodos de cada parte do ciclo adicionando log com as respectivas mensagens em cada um deles. Ao passar por cada fase, a mensagem é exibida no log como demonstrado na imagem.
Foi utilizado Glide para carregar as imagens e fazer o recorte redondo.
Foi usada a implementação mais simples possível do Jetpack Navigation para fazer a navegação entre os Fragments, num conceito de single activity.
Foi implementada uma configuração básica de cores para que o app seja compatível com o modo escuro. Os dimens de texto e espaço foram padronizados em um arquivo centralizado.
Além disso, foi acrescentado um conteúdo bem personalizado. A tela com a lista dos e-mails foi inspirada no Gmail.
Uma observação importante, conforme descrito esse projeto tem como objetivo revisar e compartilhar conhecimento básico, a recomendação para iniciar um novo projeto seria usar o Jetpack Compose e não XML.

_É sempre bom ter informação disponível na nossa língua! Mas de qualquer forma... estude inglês my friend._
