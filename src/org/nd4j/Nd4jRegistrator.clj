(ns org.nd4j.Nd4jRegistrator
  "Spark KryoRegistrator for using Nd4j with Spark  Kryo
 Use via:
 sparkConf.set(\"spark.serializer\", \"org.apache.spark.serializer.KryoSerializer\");
 sparkConf.set(\"spark.kryo.registrator\", \"org.nd4j.Nd4jRegistrator\");"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j Nd4jRegistrator]))

(defn ->nd-4j-registrator
  "Constructor."
  (^Nd4jRegistrator []
    (new Nd4jRegistrator )))

(defn register-classes
  "kryo - `com.esotericsoftware.kryo.Kryo`"
  ([^Nd4jRegistrator this ^com.esotericsoftware.kryo.Kryo kryo]
    (-> this (.registerClasses kryo))))

