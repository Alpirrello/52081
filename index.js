import antlr4, { CharStreams, CommonTokenStream, ParseTreeWalker } from "antlr4";
import ClimaLexer from "./generated/ClimaLexer.js";
import ClimaParser from "./generated/ClimaParser.js";
import readline from 'readline';
import fs from 'fs';

async function main() {
    let input;

    // Proceso la entrada con el analizador e imprimo el arbol de analisis en formato texto
    let inputStream = CharStreams.fromString(input);
    let lexer = new ClimaLexer(inputStream);
    let tokenStream = new CommonTokenStream(lexer);
    let parser = new ClimaParser(tokenStream);
    let tree = parser.prog();
}

// Ejecuta la función principal
main();