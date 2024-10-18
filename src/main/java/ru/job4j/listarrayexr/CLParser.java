package ru.job4j.listarrayexr;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. Задание: Разработка утилиты для разбора командной строки
 * Задача:
 * Реализуйте утилиту на Java для разбора входных параметров
 * командной строки. Утилита должна поддерживать следующие ключи:
 *
 * -s — короткая статистика.
 * -f — полная статистика.
 * -o — путь для выходных файлов.
 * -p — префикс для выходных файлов (может отсутствовать).
 * -a — добавление данных в файл (может отсутствовать).
 * Утилита должна корректно обрабатывать все параметры и сообщать
 * о том, какие из них были переданы.
 *
 * Реализуйте класс для обработки этих параметров и напишите юнит-тесты
 * для проверки корректности работы каждого ключа.
 *
 * Пример запуска утилиты:
 * java -jar util.jar -s -a -p sample- in1.txt in2.txt
 */
public class CLParser {
    private final String[] args;
    private boolean shortStat = false;
    private boolean fullStat = false;
    private boolean addMode = false;
    private String outputPath = null;
    private String prefix = null;
    private final List<String> inputFiles = new ArrayList<>();
    private final List<String> errors = new ArrayList<>();

    public CLParser(String[] args) {
        this.args = args;
    }

    public List<String> inputs() {
        return inputFiles;
    }

    public String prefix() {
        return prefix;
    }

    public boolean isAddMode() {
        return addMode;
    }

    public boolean hasOutputPath() {
        return outputPath != null;
    }

    public String outputPath() {
        return outputPath;
    }

    public boolean hasPrefix() {
        return prefix != null;
    }

    public boolean isShortStatistic() {
        return shortStat;
    }

    public boolean parse() {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-s":
                    shortStat = true;
                    break;
                case "-f":
                    fullStat = true;
                    break;
                case "-a":
                    addMode = true;
                    break;
                case "-o":
                    if (i + 1 < args.length) {
                        outputPath = args[++i];
                    } else {
                        errors.add("Output path is missing after -o.");
                        return false;
                    }
                    break;
                case "-p":
                    if (i + 1 < args.length) {
                        prefix = args[++i];
                    } else {
                        errors.add("Prefix is missing after -p.");
                        return false;
                    }
                    break;
                default:
                    inputFiles.add(args[i]);
                    break;
            }
        }

        if (!shortStat && !fullStat) {
            errors.add("Don't config statistic flags -s of -f.");
        }

        if (inputFiles.isEmpty()) {
            errors.add("Don't contains input files.");
        }

        return errors.isEmpty();
    }

    public List<String> description() {
        return errors;
    }

    public boolean isFullStatistic() {
        return fullStat;
    }
}
