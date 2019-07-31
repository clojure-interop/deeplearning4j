(ns org.nd4j.imports.descriptors.properties.AttributeAdapter
  "Attribute adapter for taking an attribute with an input value
 and mapping it to the proper output.
 This is for a case where the output attribute type needs to be
 adapted in some form to the field in samediff.
 A common example of this would be an array input trying to map to individual
 fields in samediff.
 For example you have:
 [1,2,3,4,5]
 A possible implementation of mapAttributeFor(Object, Field, DifferentialFunction) could be:
 void mapAttributeFor(Object inputAttributeValue, Field fieldFor, DifferentialFunction on) {
 int[] inputArr = (int[]) inputAttributeValue;
 on.setValueFor(fieldFor,inputArr[1]);
 }
 on.setValueFor(conversions.get(fieldFor),"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.descriptors.properties AttributeAdapter]))

(defn map-attribute-for
  "Map the attribute using the specified field
  on the specified function on
  adapting the given input type to
  the type of the field for the specified function.

  input-attribute-value - the evaluate to adapt - `java.lang.Object`
  field-for - the field for - `java.lang.reflect.Field`
  on - the function to map on - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^AttributeAdapter this ^java.lang.Object input-attribute-value ^java.lang.reflect.Field field-for ^org.nd4j.autodiff.functions.DifferentialFunction on]
    (-> this (.mapAttributeFor input-attribute-value field-for on))))

