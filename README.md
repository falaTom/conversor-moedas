
# 💰 Conversor de Moedas
<img width="905" height="599" alt="Image" src="https://github.com/user-attachments/assets/00c37bd5-88f7-4071-8cf9-ea4b2e826d4c" />

Este projeto foi desenvolvido como parte do desafio **Oracle Next Education (ONE)** em parceria com a **Alura**.  
O objetivo principal é praticar conceitos de **Java**, consumo de **APIs** e manipulação de **JSON**.

---

## 🚀 Funcionalidades

O programa oferece uma interface de console interativa com opções de conversão em tempo real:

- 🇦🇷 **Peso Argentino (ARS)** → 🇻🇪 **Bolívar Venezuelano (VES)**  
- 🇺🇸 **Dólar Americano (USD)** → 🇦🇷 **Peso Argentino (ARS)**  
- 🇪🇺 **Euro (EUR)** → 🇧🇷 **Real Brasileiro (BRL)**  
- 🇧🇷 **Real Brasileiro (BRL)** → 🇻🇪 **Bolívar Venezuelano (VES)**  
- 🇺🇸 **Dólar Americano (USD)** → 🇻🇪 **Bolívar Venezuelano (VES)**  
- 🇪🇺 **Euro (EUR)** → 🇦🇷 **Peso Argentino (ARS)**
    
---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 25  
- **Gerenciador de Dependências:** Maven  
- **Biblioteca Externa:** [GSON](https://github.com/google/gson) (Google) para processamento de JSON  
- **API:** [ExchangeRate-API](https://www.exchangerate-api.com/) para obter taxas de câmbio atualizadas  
- **Protocolo:** HttpClient para requisições HTTP  

---

## 📋 Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
   ```
2. Importe o projeto em uma IDE (recomendado: **IntelliJ IDEA**).  
3. Obtenha sua chave de API gratuita no site da [ExchangeRate-API](https://www.exchangerate-api.com/).  
4. No arquivo `ConsultaMoeda.java`, insira sua chave na variável correspondente.  
5. Execute a classe `Main.java` e siga as instruções no console.  

---

## 📂 Estrutura do Projeto

```
conversor-moedas/
│── src/
│   └── main/
│       └── java/
│           └── org/example/
│               ├── Main.java
│               ├── ConsultaMoeda.java
│               └── ...
│── pom.xml
│── README.md
│── .gitignore
```

---

## 👨‍💻 Autor

Desenvolvido por **Everton da Silva Brito**  
📫 Entre em contato: [LinkedIn](https://www.linkedin.com) | [GitHub](https://github.com/falaTom)

---
