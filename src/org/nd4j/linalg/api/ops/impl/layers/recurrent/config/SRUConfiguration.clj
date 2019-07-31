(ns org.nd4j.linalg.api.ops.impl.layers.recurrent.config.SRUConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.recurrent.config SRUConfiguration]))

(defn ->sru-configuration
  "Constructor."
  (^SRUConfiguration []
    (new SRUConfiguration )))

(defn args
  "returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SRUConfiguration this]
    (-> this (.args))))

