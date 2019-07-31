(ns org.nd4j.imports.descriptors.properties.adapters.ConditionalFieldValueIntIndexArrayAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.descriptors.properties.adapters ConditionalFieldValueIntIndexArrayAdapter]))

(defn ->conditional-field-value-int-index-array-adapter
  "Constructor."
  (^ConditionalFieldValueIntIndexArrayAdapter []
    (new ConditionalFieldValueIntIndexArrayAdapter )))

(defn map-attribute-for
  "Description copied from interface: AttributeAdapter

  input-attribute-value - the evaluate to adapt - `java.lang.Object`
  field-for - the field for - `java.lang.reflect.Field`
  on - the function to map on - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^ConditionalFieldValueIntIndexArrayAdapter this ^java.lang.Object input-attribute-value ^java.lang.reflect.Field field-for ^org.nd4j.autodiff.functions.DifferentialFunction on]
    (-> this (.mapAttributeFor input-attribute-value field-for on))))

