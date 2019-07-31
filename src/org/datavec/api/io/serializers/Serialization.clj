(ns org.datavec.api.io.serializers.Serialization
  "Encapsulates a Serializer/Deserializer pair."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.serializers Serialization]))

(defn accept
  "Allows clients to test whether this Serialization
  supports the given class.

  c - `java.lang.Class`

  returns: `boolean`"
  (^Boolean [^Serialization this ^java.lang.Class c]
    (-> this (.accept c))))

(defn get-serializer
  "c - `java.lang.Class`

  returns: a Serializer for the given class. - `org.datavec.api.io.serializers.Serializer<T>`"
  (^org.datavec.api.io.serializers.Serializer [^Serialization this ^java.lang.Class c]
    (-> this (.getSerializer c))))

(defn get-deserializer
  "c - `java.lang.Class`

  returns: a Deserializer for the given class. - `org.datavec.api.io.serializers.Deserializer<T>`"
  (^org.datavec.api.io.serializers.Deserializer [^Serialization this ^java.lang.Class c]
    (-> this (.getDeserializer c))))

