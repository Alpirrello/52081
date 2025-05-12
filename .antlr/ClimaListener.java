// Generated from c:/Users/Usuario/Desktop/1UTN/Sintaxis/52081/Clima.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClimaParser}.
 */
public interface ClimaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClimaParser#clima_script}.
	 * @param ctx the parse tree
	 */
	void enterClima_script(ClimaParser.Clima_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClimaParser#clima_script}.
	 * @param ctx the parse tree
	 */
	void exitClima_script(ClimaParser.Clima_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClimaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ClimaParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClimaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ClimaParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClimaParser#monitoreo}.
	 * @param ctx the parse tree
	 */
	void enterMonitoreo(ClimaParser.MonitoreoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClimaParser#monitoreo}.
	 * @param ctx the parse tree
	 */
	void exitMonitoreo(ClimaParser.MonitoreoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClimaParser#respuesta}.
	 * @param ctx the parse tree
	 */
	void enterRespuesta(ClimaParser.RespuestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClimaParser#respuesta}.
	 * @param ctx the parse tree
	 */
	void exitRespuesta(ClimaParser.RespuestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClimaParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(ClimaParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClimaParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(ClimaParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClimaParser#sensor_clima}.
	 * @param ctx the parse tree
	 */
	void enterSensor_clima(ClimaParser.Sensor_climaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClimaParser#sensor_clima}.
	 * @param ctx the parse tree
	 */
	void exitSensor_clima(ClimaParser.Sensor_climaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClimaParser#aspecto}.
	 * @param ctx the parse tree
	 */
	void enterAspecto(ClimaParser.AspectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClimaParser#aspecto}.
	 * @param ctx the parse tree
	 */
	void exitAspecto(ClimaParser.AspectoContext ctx);
}