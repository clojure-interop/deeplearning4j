(ns org.nd4j.primitives.AtomicDoubleSerializer
  "Serializer for AtomicDouble (needs a serializer due to long field being transient...)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.primitives AtomicDoubleSerializer]))

(defn ->atomic-double-serializer
  "Constructor."
  (^AtomicDoubleSerializer []
    (new AtomicDoubleSerializer )))

(defn write
  "kryo - `com.esotericsoftware.kryo.Kryo`
  output - `com.esotericsoftware.kryo.io.Output`
  a - `org.nd4j.linalg.primitives.AtomicDouble`"
  ([^AtomicDoubleSerializer this ^com.esotericsoftware.kryo.Kryo kryo ^com.esotericsoftware.kryo.io.Output output ^org.nd4j.linalg.primitives.AtomicDouble a]
    (-> this (.write kryo output a))))

(defn read
  "kryo - `com.esotericsoftware.kryo.Kryo`
  input - `com.esotericsoftware.kryo.io.Input`
  a - `java.lang.Class`

  returns: `org.nd4j.linalg.primitives.AtomicDouble`"
  (^org.nd4j.linalg.primitives.AtomicDouble [^AtomicDoubleSerializer this ^com.esotericsoftware.kryo.Kryo kryo ^com.esotericsoftware.kryo.io.Input input ^java.lang.Class a]
    (-> this (.read kryo input a))))

