(ns org.nd4j.imports.descriptors.properties.adapters.StringEqualsAdapter
  "Comparison for whether a string equals a target string
 returning a boolean"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.descriptors.properties.adapters StringEqualsAdapter]))

(defn ->string-equals-adapter
  "Constructor."
  (^StringEqualsAdapter []
    (new StringEqualsAdapter )))

(defn map-attribute-for
  "Description copied from interface: AttributeAdapter

  input-attribute-value - the evaluate to adapt - `java.lang.Object`
  field-for - the field for - `java.lang.reflect.Field`
  on - the function to map on - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^StringEqualsAdapter this ^java.lang.Object input-attribute-value ^java.lang.reflect.Field field-for ^org.nd4j.autodiff.functions.DifferentialFunction on]
    (-> this (.mapAttributeFor input-attribute-value field-for on))))

