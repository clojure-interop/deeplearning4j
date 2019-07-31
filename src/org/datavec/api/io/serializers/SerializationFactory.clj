(ns org.datavec.api.io.serializers.SerializationFactory
  "A factory for Serializations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.io.serializers SerializationFactory]))

(defn ->serialization-factory
  "Constructor.

  Serializations are found by reading the io.serializations
  property from conf, which is a comma-delimited list of
  classnames.

  conf - `org.datavec.api.conf.Configuration`"
  (^SerializationFactory [^org.datavec.api.conf.Configuration conf]
    (new SerializationFactory conf)))

(defn get-serializer
  "c - `java.lang.Class`

  returns: `<T> org.datavec.api.io.serializers.Serializer<T>`"
  ([^SerializationFactory this ^java.lang.Class c]
    (-> this (.getSerializer c))))

(defn get-deserializer
  "c - `java.lang.Class`

  returns: `<T> org.datavec.api.io.serializers.Deserializer<T>`"
  ([^SerializationFactory this ^java.lang.Class c]
    (-> this (.getDeserializer c))))

(defn get-serialization
  "c - `java.lang.Class`

  returns: `<T> org.datavec.api.io.serializers.Serialization<T>`"
  ([^SerializationFactory this ^java.lang.Class c]
    (-> this (.getSerialization c))))

