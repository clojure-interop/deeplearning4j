(ns org.nd4j.imports.descriptors.properties.adapters.IntArrayIntIndexAdpater
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports.descriptors.properties.adapters IntArrayIntIndexAdpater]))

(defn ->int-array-int-index-adpater
  "Constructor."
  (^IntArrayIntIndexAdpater []
    (new IntArrayIntIndexAdpater )))

(defn map-attribute-for
  "Description copied from interface: AttributeAdapter

  input-attribute-value - the evaluate to adapt - `java.lang.Object`
  field-for - the field for - `java.lang.reflect.Field`
  on - the function to map on - `org.nd4j.autodiff.functions.DifferentialFunction`"
  ([^IntArrayIntIndexAdpater this ^java.lang.Object input-attribute-value ^java.lang.reflect.Field field-for ^org.nd4j.autodiff.functions.DifferentialFunction on]
    (-> this (.mapAttributeFor input-attribute-value field-for on))))

