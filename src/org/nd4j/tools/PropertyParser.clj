(ns org.nd4j.tools.PropertyParser
  "PropertyParser"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.tools PropertyParser]))

(defn ->property-parser
  "Constructor.

  properties - `java.util.Properties`"
  (^PropertyParser [^java.util.Properties properties]
    (new PropertyParser properties)))

(defn parse-string
  "Parse property.

  name - property name - `java.lang.String`

  returns: property - `java.lang.String`"
  (^java.lang.String [^PropertyParser this ^java.lang.String name]
    (-> this (.parseString name))))

(defn parse-char
  "Parse property.

  name - property name - `java.lang.String`

  returns: property - `char`"
  (^Character [^PropertyParser this ^java.lang.String name]
    (-> this (.parseChar name))))

(defn to-double
  "Get property. The method returns the default value if the property is not parsed.

  name - property name - `java.lang.String`
  default-value - default value - `double`

  returns: property - `double`"
  (^Double [^PropertyParser this ^java.lang.String name ^Double default-value]
    (-> this (.toDouble name default-value)))
  (^Double [^PropertyParser this ^java.lang.String name]
    (-> this (.toDouble name))))

(defn parse-float
  "Parse property.

  name - property name - `java.lang.String`

  returns: property - `float`"
  (^Float [^PropertyParser this ^java.lang.String name]
    (-> this (.parseFloat name))))

(defn to-string
  "Get property. The method returns the default value if the property is not parsed.

  name - property name - `java.lang.String`
  default-value - default value - `java.lang.String`

  returns: property - `java.lang.String`"
  (^java.lang.String [^PropertyParser this ^java.lang.String name ^java.lang.String default-value]
    (-> this (.toString name default-value)))
  (^java.lang.String [^PropertyParser this ^java.lang.String name]
    (-> this (.toString name))))

(defn get-properties
  "returns: `java.util.Properties`"
  (^java.util.Properties [^PropertyParser this]
    (-> this (.getProperties))))

(defn to-float
  "Get property. The method returns the default value if the property is not parsed.

  name - property name - `java.lang.String`
  default-value - default value - `float`

  returns: property - `float`"
  (^Float [^PropertyParser this ^java.lang.String name ^Float default-value]
    (-> this (.toFloat name default-value)))
  (^Float [^PropertyParser this ^java.lang.String name]
    (-> this (.toFloat name))))

(defn to-boolean
  "Get property. The method returns the default value if the property is not parsed.

  name - property name - `java.lang.String`
  default-value - default value - `boolean`

  returns: property - `boolean`"
  (^Boolean [^PropertyParser this ^java.lang.String name ^Boolean default-value]
    (-> this (.toBoolean name default-value)))
  (^Boolean [^PropertyParser this ^java.lang.String name]
    (-> this (.toBoolean name))))

(defn set-properties
  "properties - `java.util.Properties`"
  ([^PropertyParser this ^java.util.Properties properties]
    (-> this (.setProperties properties))))

(defn parse-boolean
  "Parse property.

  name - property name - `java.lang.String`

  returns: property - `boolean`"
  (^Boolean [^PropertyParser this ^java.lang.String name]
    (-> this (.parseBoolean name))))

(defn to-long
  "Get property. The method returns the default value if the property is not parsed.

  name - property name - `java.lang.String`
  default-value - default value - `long`

  returns: property - `long`"
  (^Long [^PropertyParser this ^java.lang.String name ^Long default-value]
    (-> this (.toLong name default-value)))
  (^Long [^PropertyParser this ^java.lang.String name]
    (-> this (.toLong name))))

(defn parse-double
  "Parse property.

  name - property name - `java.lang.String`

  returns: property - `double`"
  (^Double [^PropertyParser this ^java.lang.String name]
    (-> this (.parseDouble name))))

(defn parse-long
  "Parse property.

  name - property name - `java.lang.String`

  returns: property - `long`"
  (^Long [^PropertyParser this ^java.lang.String name]
    (-> this (.parseLong name))))

(defn to-int
  "Get property. The method returns the default value if the property is not parsed.

  name - property name - `java.lang.String`
  default-value - default value - `int`

  returns: property - `int`"
  (^Integer [^PropertyParser this ^java.lang.String name ^Integer default-value]
    (-> this (.toInt name default-value)))
  (^Integer [^PropertyParser this ^java.lang.String name]
    (-> this (.toInt name))))

(defn to-char
  "Get property. The method returns the default value if the property is not parsed.

  name - property name - `java.lang.String`
  default-value - default value - `char`

  returns: property - `char`"
  (^Character [^PropertyParser this ^java.lang.String name ^Character default-value]
    (-> this (.toChar name default-value)))
  (^Character [^PropertyParser this ^java.lang.String name]
    (-> this (.toChar name))))

(defn parse-int
  "Parse property.

  name - property name - `java.lang.String`

  returns: property - `int`"
  (^Integer [^PropertyParser this ^java.lang.String name]
    (-> this (.parseInt name))))

