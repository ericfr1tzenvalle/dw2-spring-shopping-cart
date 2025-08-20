# 🛒 Projeto Carrinho de Compras com Spring Boot

Este é um projeto simples de carrinho de compras desenvolvido com **Spring Boot**, criado para demonstrar os conceitos fundamentais do desenvolvimento web com o framework Spring.

---

## 📜 Descrição

A aplicação simula um catálogo de produtos de um mercado, permitindo que o usuário visualize os itens disponíveis e os adicione a um carrinho de compras virtual.  

O objetivo principal é servir como **exemplo prático e didático** para quem está começando com **Spring Boot, Spring MVC e Thymeleaf**.

---

## ✨ Funcionalidades

- **Listagem de Produtos:**  
  Exibe todos os produtos disponíveis em uma página inicial, carregados a partir de um repositório em memória.

- **Adicionar ao Carrinho:**  
  Permite que o usuário adicione produtos ao carrinho diretamente da página de listagem.

- **Visualização do Carrinho:**  
  Mostra todos os itens no carrinho, incluindo:
  - Quantidade de cada item
  - Subtotal por item
  - Valor total da compra  
  O estado do carrinho é mantido **através da sessão do usuário**.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot:** Framework principal para criação de aplicações Spring.  
- **Spring Web (MVC):** Para criar a arquitetura web e gerenciar requisições/respostas.  
- **Thymeleaf:** Template engine para renderização dinâmica de HTML no servidor.  
- **Spring Boot Validation:** Validação de dados de entrada no backend.  
- **Maven:** Gerenciamento de dependências e build do projeto.

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ericfr1tzenvalle/dw2-spring-shopping-cart.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd carrinho-compras-springboot
   ```

3. Compile e execute:
   ```bash
   mvn spring-boot:run
   ```

4. Abra o navegador e acesse:
   ```
   http://localhost:8080/produtos
   ```

---

## 💡 Observações

- Projeto focado em **aprendizado e demonstração**, não para uso em produção.  
- O carrinho é mantido **na sessão**, portanto, cada usuário terá seu próprio estado de compra enquanto durar a sessão.
