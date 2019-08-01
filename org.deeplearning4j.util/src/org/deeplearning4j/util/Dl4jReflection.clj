(ns org.deeplearning4j.util.Dl4jReflection
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util Dl4jReflection]))

(defn *get-empty-constructor
  "Gets the empty constructor from a class

  clazz - the class to get the constructor from - `java.lang.Class`

  returns: the empty constructor for the class - `java.lang.reflect.Constructor<?>`"
  (^java.lang.reflect.Constructor [^java.lang.Class clazz]
    (Dl4jReflection/getEmptyConstructor clazz)))

(defn *get-all-fields
  "clazz - `java.lang.Class`

  returns: `java.lang.reflect.Field[]`"
  ([^java.lang.Class clazz]
    (Dl4jReflection/getAllFields clazz)))

(defn *set-properties
  "Sets the properties of the given object

  obj - the object o set - `java.lang.Object`
  props - the properties to set - `java.util.Properties`

  throws: java.lang.Exception"
  ([^java.lang.Object obj ^java.util.Properties props]
    (Dl4jReflection/setProperties obj props)))

(defn *get-fields-as-properties
  "Get fields as properties

  obj - the object to get fields for - `java.lang.Object`
  clazzes - the classes to use for reflection and properties.T - `java.lang.Class[]`

  returns: the fields as properties - `java.util.Properties`

  throws: java.lang.Exception"
  (^java.util.Properties [^java.lang.Object obj clazzes]
    (Dl4jReflection/getFieldsAsProperties obj clazzes)))

