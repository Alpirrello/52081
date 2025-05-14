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
    const texto = ctx.STRING().getText().slice(1, -1); 
    const minutos = parseInt(ctx.NUM().getText());
    console.log(`Configurado imprimir "${texto}" cada ${minutos} minutos`);
    setInterval(() => { console.log(texto); }, minutos * 1000); 
    return null;
  }

  visitMonitoreo(ctx) {
    const sensor = ctx.sensor_clima().getText();
    if (sensor === 'temperatura') {
      console.log('Monitoreando temperatura');
    } else if (sensor === 'humedad') {
      console.log('Monitoreando humedad');
    }
    return null;
  }

  visitRespuesta(ctx) {
    const sensor = ctx.sensor_clima().getText();
    if (sensor === 'temperatura') {
      console.log('Respuesta cuando temperatura sube');
    } else if (sensor === 'humedad') {
      console.log('Respuesta cuando humedad sube');
    }
    return null;
  }
}