package org.example.example3;
// Разделение длинных методов на более мелкие и понятные.

import java.util.List;

import javax.xml.crypto.Data;
/*
public class DataProcessor {
    public void processAndSaveData (List<Data> dataList) {
        // Шаг1: Подготовка данных
        prepareData (dataList);
        // Шаг2: Обработка данных
        for (Datadata: dataList) {
            if (data.isValid()) {
                calculateMetrics (data);
                normalizeData (data);
            }
        }
        // Шаг3: Сохранение данных
        saveData (dataList);
    }
    private void prepareData (List<Data> dataList) {
        //Некоторый код для подготовки данных
        }
    private void calculateMetrics (Datadata) {
        //Расчет метрик на основе данных
        }
    private void normalizeData (Datadata) {
        // Нормализация данных
        }
    private void saveData(List<Data> dataList) {
        // Сохранение данных в базу данных или файл
        }
}
*/
// Этот код содержит метод processAndSaveData, который выполняет несколько шагов: подготовку данных, обработку данных, сохранение данных. Каждый из этих шагов может быть выделен в отдельный метод для улучшения читаемости кода.
// Рефакторинг:
public class DataProcessor {
    public void processAndSaveData (List<Data> dataList) {
        prepareData (dataList);
        processValidData(dataList);
        saveData(dataList);
    }
    private void prepareData (List<Data> dataList) {
        //Некоторый код для подготовки данных
        }
    private void processValidData (List<Data> dataList) {
        for (Data data: dataList) {
            if (data.isValid()) {
                processSingleData(data);
            }
        }
    }
    private void processSingleData (Data data) {
        calculateMetrics(data);
        normalizeData(data);
    }
    private void calculateMetrics(Data data) {
        // Расчет метрик на основе данных
        }
    private void normalizeData(Data data) {
        // Нормализация данных
        }
    private void saveData(List<Data> dataList) {
        // Сохранение данных в базу данных или файл
        }
    }
    // В результате рефакторинга длинный метод processAndSaveData был разделен на три более мелких метода: prepareData, processValidData и saveData. Каждый метод выполняет свою специфическую задачу, что делает код более читаемым и легко понимаемым.