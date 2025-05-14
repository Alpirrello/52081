import ClimaVisitor from './generated/ClimaVisitor.js';

export default class CustomClimaVisitor extends ClimaVisitor {
  constructor() {
    super();
  }

  visitClima_script(ctx) {
    return this.visitChildren(ctx);
  }

  visitAction(ctx) {
    if (ctx.imprimir()) {
    return this.visitImprimir(ctx.imprimir());
  }
    if (ctx.monitoreo()) {
    return this.visitMonitoreo(ctx.monitoreo());
  }
    if (ctx.respuesta()) {
    return this.visitRespuesta(ctx.respuesta());
  }
    return null;
  }

  visitImprimir(ctx) {
    const texto = ctx.STRING().getText().slice(1, -1); // elimina comillas
    const minutos = parseInt(ctx.NUM().getText());
    console.log(`Configurado imprimir "${texto}" cada ${minutos} minutos`);
    setInterval(() => { console.log(texto); }, minutos * 1000); 
    return null;
  }

  visitMonitoreo(ctx) {
    console.log(ctx.sensor_clima().getText());
    return null;
  }

  visitRespuesta(ctx) {
    console.log(ctx.sensor_clima().getText());
    return null;
  } 
}