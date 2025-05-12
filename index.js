import antlr4 from "antlr4";
import ClimaLexer from "./generated/ClimaLexer.js";
import ClimaParser from "./generated/ClimaParser.js";
import fs from 'fs';

const input = fs.readFileSync('./input.txt', 'utf8');
const chars = new antlr4.InputStream(input);
const lexer = new ClimaLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new ClimaParser(tokens);
const tree = parser.clima_script();

console.log("Arbol de derivacion:\n\r" + tree.toStringTree(parser.ruleNames));