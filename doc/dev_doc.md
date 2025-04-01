# Fejlesztői dokumentáció

## Az alkamazás célja

Az alkalmazás járművek adatait tölti be CSV fájlokból, majd azokon programozási tételeket valósít meg.

## Eszközök

Az alkamazás VSCode-dal készült. A Java projekt "No build tools" választással jött létre.

## Forrásfájlok

A forrásfájlok src könyvtárban találhatók egységben.

## Az App osztály

Az App osztály csak az alkalmazás indítását szolgálja.

## A Solution osztály

A Solution osztály szolgáltatja a megoldásokat. Minden egyes metódus egy-egy programozási tételt valósít meg.

Minden metódus kiírja a saját maga által generált eredményt.

## A FileReader osztály

A FileReader osztály valósitja meg a fájlok beolvasását. Az ipari kód a tryReadFile metódusban van megvalósítva, a readFile csak hibakezelést valósítja meg.

## A Car osztály

A Car osztály objektumaiban tároljuk egy jármű adatait.