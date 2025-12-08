// Java HTTP Client

/* Java предоставляет несколько способов для выполнения HTTP-запросов.
1. Использование класса HttpURLConnection: Этот класс входит в стандартную
библиотеку Java и является простым способом для выполнения HTTP-запросов.
2. Использование библиотеки HttpClient из пакета java.net.http: Более
современный и удобный способ, доступный с Java 11. */

/* Подготовка:
Так как нам предстоит выполнять HTTP запросы. Необходимо поднять HTTP
сервер. Это трудоемкий процесс и требует понимания определенных технологий. Поэтому
будем использовать бесплатный mock сервис https://jsonplaceholder.typicode.com/. */

/* Гайд по работе с mock сервисом https://jsonplaceholder.typicode.com/guide/
Для работы с JSON будем использовать библиотеку jackson для этого добавим в файл
build.gradle зависимость
// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
implementation ‘com.fasterxml.jackson.core:jackson-databind:2.17.1’ */

/* Работа с HttpURLConnection
Класс HttpURLConnection является частью стандартной библиотеки Java и предоставляет
основной функционал для выполнения HTTP-запросов. Хотя он менее удобен по сравнению с
HttpClient из пакета java.net.http, HttpURLConnection по-прежнему широко используется. */

/* Основные шаги работы с HttpURLConnection
1. Создание URL-объекта.
2. Открытие соединения.
3. Настройка соединения (метод, заголовки, таймауты и т.д.).
4. Отправка запроса.
5. Чтение ответа.
6. Закрытие соединения. */

/* Пример запроса GET
Запросы GET используются для получения данных с сервера. Они не изменяют состояние
сервера и не содержат тела запроса. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPUrlConnect {
    public static void get() {
        try {
            // Создаем URL-объект
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");

            // Открываем соединение
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Устанавливаем метод запроса
            con.setRequestMethod("GET");

            // Устанавливаем таймауты (необязательно)
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            // Отправляем запрос и получаем ответный код
            int status = con.getResponseCode();

            // Чтение ответа
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            // Закрытие потоков
            in.close();
            con.disconnect();
            ObjectMapper objectMapper = new ObjectMapper();
            List<Post> posts = objectMapper.readValue(content.toString(), new TypeReference<List<Post>>() {});
            // Вывод ответа
            System.out.println("Response Code: " + status);
            System.out.println("Response Body: " + posts);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * Пример запроса POST
 * Запросы POST используются для отправки данных на сервер. Они могут создавать
 * новые
 * ресурсы или обновлять существующие.
 */
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPUrlConnect {
    public static void post(Post post) throws IOException {
        // Создаем URL-объект
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");

        // Открываем соединение
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        // Устанавливаем метод запроса и свойства соединения
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
        ObjectMapper objectMapper = new ObjectMapper();
        String payload = objectMapper.writeValueAsString(post);

        // Отправка данных
        try (OutputStream os = con.getOutputStream()) {
            byte[] input = payload.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        // Чтение ответа
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
        StringBuilder response = new StringBuilder();
        String responseLine;
        while ((responseLine = in.readLine()) != null) {
            response.append(responseLine.trim());
        }

        // Закрытие соединения
        in.close();
        con.disconnect();

        // Вывод ответа
        System.out.println("Response Code: " + status);
        System.out.println("Response Body: " + response);
    }
}

// Работа с
// HttpClient
// Работа
// с HttpClient
// в Java HttpClient–
// это современный HTTP-клиент,
// представленный в Java 11.
// Он более
// мощный и
// удобный по
// сравнению с
// HttpURLConnection и
// поддерживает асинхронные операции,
// что делает
// его подходящим
// для высокопроизводительных
// приложений.
// Основные возможности HttpClient 1.
// Поддержка синхронных
// и асинхронных запросов.2.
// Автоматическая обработка HTTP/2. 3.
// Поддержка стандартных HTTP-методов (GET, POST, PUT, DELETE и т.д.).
// 4. Настройка таймаутов, редиректов и прокси.
// 5. Работа с заголовками и телами запросов и ответов.
// Основные шаги работы с HttpClient
// 1. Создание экземпляра HttpClient.
// 2. Создание HttpRequest.
// 3. Отправка запроса и обработка ответа.
// Примеры синхронного и асинхронного запроса с использованием HttpClient
// Синхронный запрос
// Синхронный запрос выполняется в текущем потоке и блокирует его до получения
// ответа от
// сервера.
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientSyncExample {
    public static void main(String[] args) {
        try {
            // Создание экземпляра HttpClient
            HttpClient client = HttpClient.newHttpClient();
            // Создание запроса
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                    .timeout(Duration.ofSeconds(10))
                    .GET()
                    .build();
            // Отправка запроса и получение ответа
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            List<Post> posts = objectMapper.readValue(resp.body(), new TypeReference<>() {
            });
            // Обработка ответа
            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body: " + response.posts());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Асинхронный запрос
// выполняется в
// отдельном потоке, позволяя
// текущему потоку
// продолжить
// выполнение.
// Результат запроса
// возвращается в
// виде CompletableFuture
// .
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class HttpClientAsyncExample {
    public static void main(String[] args) {
        // Создание экземпляра HttpClient
        HttpClient client = HttpClient.newHttpClient();
        // Создание запроса
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();
        // Отправка асинхронного запроса и получение CompletableFuture
        CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request,
                HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        // Обработка ответа
        responseFuture.whenComplete((res, err) -> {
            try {
                List<Post> posts = objectMapper.readValue(res.body(), new TypeReference<List<Post>>() {
                });
                System.out.println(posts);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
        // Выполнение других задач, пока ответ не будет получен
        System.out.println("Request sent. Performing other tasks...");
    }}

    // Сравнение синхронного
    // и асинхронного запросов 1.
    // Синхронный запрос:–
    // Блокирует текущий
    // поток до
    // получения ответа.–
    // Прост в реализации,
    // но может
    // привести к задержкам,
    // если сервер
    // отвечает
    // медленно.–
    // Подходит для
    // простых задач, где
    // задержка не
    // критична или
    // где выполнение
    // должно быть последовательным.2.
    // Асинхронный запрос:–
    // Не блокирует
    // текущий поток, позволяя
    // выполнять другие задачи.–
    // Более сложен
    // в реализации, но
    // обеспечивает лучшую
    // производительность и
    // отзывчивость приложения.–
    // Подходит для приложений,
    // требующих высокой производительности,
    // таких как
    // пользовательские интерфейсы
    // или системы
    // с большим
    // количеством
    // одновременных
    // запросов.Дополнительные возможности
    // HttpClient
    // Установка
    // заголовков Для
    // установки заголовков
    // запроса используется
    // метод header.
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://jsonplaceholder.typicode.com/data"))
            .header("Content-Type", "application/json")
            .header("Authorization", "Bearer your_token_here")
            .build();
    // Таймауты Таймауты
    // устанавливаются с
    // помощью метода
    // timeout в
    // объекте запроса.
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://jsonplaceholder.typicode.com/data"))
            .timeout(Duration.ofSeconds(10))
            .build();
    // Переадресация Настройка
    // поведения переадресации
    // осуществляется через HttpClient.Redirect:
    HttpClient client = HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();
    // Обработка ошибок
    // Для обработки
    // ошибок можно
    // использовать код
    // ответа и
    // при необходимости
    // обрабатывать исключения.
    client.sendAsync(request,HttpResponse.BodyHandlers.ofString()).thenApply(response->
    {
        if (response.statusCode() != 200) {
            throw new RuntimeException("Failed: " + response.statusCode());
        }
        return response.body();
    }).exceptionally(e->
    {
        System.err.println("Error: " + e.getMessage());
        return null;
}).thenAccept(System.out::println).join();
// Отправка файлов
// Для отправки
// файлов можно
// использовать
BodyPublishers.ofFile.HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://jsonplaceholder.typicode.com/upload"))
        .header("Content-Type", "application/octet-stream")
        .POST(HttpRequest.BodyPublishers.ofFile(Paths.get("path/to/file.txt")))
        .build();client.sendAsync(request,HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join()
;