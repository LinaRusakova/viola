var app2 = new Vue({
	el: '#app-2',
	data: {
		message: 'Вы загрузили эту страницу: ' + new Date().toLocaleString(),

		//	Макет карточки
		cards: [
//			{
//				cardTitle: 'Заголовок карточки',
//				cardImageAlterText: 'Заголовок карточки',
//				cardDescription: 'Описание к фото',
//				cardDate: 'Загружено: ' + new Date().toLocaleString()
//			},
//			{
//				cardTitle: 'Заголовок карточки 01',
//				cardImageAlterText: 'Заголовок карточки 01 ',
//				cardDescription: 'Описание к фото 01',
//				cardDate: 'Загружено: ' + new Date().toLocaleString()
//			},
//				{cardTitle: 'Заголовок карточки 03',
//				cardImageAlterText: 'Заголовок карточки 03 ',
//				cardDescriptionLong: 'Описание к фото 03',
//				cardDate: 'Загружено: ' + new Date().toLocaleString()
//			},
		],
		//	Макет формы загрузки новых карточек
		labelDescription: 'Описание',
		placeholderDescription: 'Описание к фото',
		sendButtonText: "Загрузить карточку"
	},
	created: function() {
	axios({
      method: 'get',
      url: 'composing/card-manager/cards/3fa85f64-5717-4562-b3fc-2c963f66afa6',
       baseURL: 'http://localhost:8603/',
      responseType: 'json'
    })
      .then((response) => (this.cards.push(response.data)));


//	this.cards.push(axios.get("composing/card-manager/cards/3fa85f64-5717-4562-b3fc-2c963f66afa6"))
	}
	,
	  methods: {
        postCard: function () {

         axios.post('http://localhost:8603/cards', {
             cardTitle: cardDescription,
             cardDescription: cardDescription
           })
           .then(function (response) {
             console.log(response);
           })
           .catch(function (error) {
             console.log(error);
           });
        }
      }
})
