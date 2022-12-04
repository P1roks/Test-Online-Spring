--create table questions(
--    id INT not null auto_increment primary key,
--    question varchar(255) NOT NULL,
--    optionA varchar(255) not null,
--    optionB varchar(255) not null,
--    optionC varchar(255),
--    optionD varchar(255),
--    corrIdx tinyint unsigned not null,
--    points tinyint unsigned not null,
--    image BLOB);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(1,"Czym jest PHP?",
    "Skryptowym językiem programowania zaprojektowanym do generowania stron internetowych i budowania aplikacji webowych w czasie rzeczywistym.",
    "Niskopoziomym językim, służącym do programowania mikroprocesorów",
    "Językiem znaczników stosowanym do tworzenia dokumentów hipertekstowych",
    "Językiem, stosowanym do tworzenia gier",0,1);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(2,"Kaskadowe arkusze stylów tworzy się w celu:",
    "połączenia struktury dokumentu strony z właściwą formą jego prezentacji",
    "blokowania jakichkolwiek zmian w wartościach znaczników już przypisanych w pliku CSS",
    "nadpisywania wartości znaczników już ustawionych na stronie",
    "ułatwienia formatowania strony",0,2);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(3,"Aby obsłużyć połączenie z bazą MySQL podczas tworzenia aplikacji internetowej,
można wykorzystać język",
    "XHTML",
    "CSS",
    "Basic",
    "PHP",
3,2);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(4,"Formatem zapisu rastrowych plików graficznych z kompresją bezstratną jest",
    "CDR",
    "SVG",
    "PNG",
    "JNG",
2,4);
/* Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(5,"<img src=\"img\phpcodesnippet.png\">W podanym kodzie PHP zdefiniowano:",
    "dwa obiekty",
    "dwie właściwości",
    "jedną właścwiość",
    "dwie metody",
1,5), */
/* Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(6,"<img src=\"img\sql.jpg\">Przedstawione polecenie MySQL ma za zadanie",
    "Usunąć kolumnę tytul z tabeli ksiazki",
    "Zmienić typ kolumny w tabeli ksiazki",
    "Zmienić nazwę kolumny w tabeli ksiazki",
    "Dodać do tabeli ksiazki kolumnę tytul",
1,5), */
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(7,"Która z deklaracji funkcji w języku C++ ma parametr wejściowy typu rzeczywistego, a zwraca wartość całkowitą?",
    "void foo(int a);",
    "auto foo(auto a);",
    "int foo(float a);",
    "float foo(int a)",
2,1);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(8,"W języku HTML atrybut alt znacznika img jest wykorzystywany w celu zdefiniowania",
    "tekstu, który będzie wyświetlony, jeśli nie może być wyświetlona grafika",
    "ścieżki i nazwy pliku źródłowego grafiki",
    "podpisu, który zostanie wyświetlony pod grafiką",
    "atrybutów grafiki, takich jak rozmiar, obramowanie, wyrównanie",
0,3);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(9,"Pseudoklasa hover, w CSS aktywuje się:",
    "Po kliknięciu na dany element",
    "Po najechaniu na dany element",
    "Zawsze",
    "Po odwiedzeniu linku",
1,1);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(10,"Aby zadeklarować pole klasy, do którego mają dostęp jedynie metody tej
klasy i pole to nie jest dostępne dla klas pochodnych, należy użyć kwalifikatora dostępu",
    "friend",
    "public",
    "private",
    "protected",
2,3);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(11,"W języku PHP zmienna \$_GET jest zmienną",
    "predefiniowaną, używaną do gromadzenia wartości formularza po nagłówkach zlecenia HTTP
    (danych z formularza nie można zobaczyć w adresie)",
    "zdefiniowaną przez twórcę strony, służącą do przekazywania danych z formularza przez adres strony",
    "predefiniowaną, używaną do przekazywania danych do skryptów PHP poprzez adres strony",
    "zwykłą, zdefiniowaną przez twórcę strony",
2,2);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(12,"Przy użyciu którego znacznika w języku HTML nie można umieścić na stronie grafiki dynamicznej?",
    "&ltobject&gt",
    "&ltstrike&gt",
    "&ltembed&gt",
    "&ltimg&gt",
1,3);
Insert Into questions (id,question,optionA,optionB,optionC,optionD,corr_idx,points) values(13,"Selektor CSS a:link {color:red} zawarty w kaskadowych arkuszach stylów definiuje",
    "klasę",
    "identyfikator",
    "pseudoelement",
    "pseudoklasę",
3,4);
