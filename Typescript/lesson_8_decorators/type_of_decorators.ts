/** Декораторы классов в TS */

type ClassDecorator = <TFunction extends Function>
  (target: TFunction) => TFunction | void;

/** Декоратор свойства */
type PropertyDecorator = (target: Object, propertyKey: string | symbol) => void;

/** Декоратор метода */
type MethodDecorator = <T>(
    target: Object,
    propertyKey: string | symbol,
    descriptor: TypedPropertyDescriptor<T>
) => TypedPropertyDescriptor<T> | void;

/** Декоратор ацессора имеет такой же тип, как и метода с той лишь разницей, что ключи дескриптора отличаются
 * 
 * Дескриптор позволяет настроить изменяемость, видимость для for in внутренние свойства объекта
 * 
 * Дескриптор в декораторе метода имеет ключи:
 * - value - значение свойства
 * - writable - если false, то значение менять нельзя
 * - enumerable - свойство видно для функции прохода по объекту for...in
 * - configurable - удаляемое свойство, если true
 * 
 * Дескриптор ацессор декоратора имеет ключи:
 * - get - прочитать значение свойства
 * - set - записать значение свойства
 * - enumerable - свойство видно для функции прохода по объекту for...in
 * - configurable - удаляемое свойство, если true
 */

/** Декоратор параметра */
type ParameterDecorator = (target: Object, propertyKey: string | symbol, parameterIndex: number) => void;