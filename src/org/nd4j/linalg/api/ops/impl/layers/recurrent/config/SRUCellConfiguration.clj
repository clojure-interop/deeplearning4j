(ns org.nd4j.linalg.api.ops.impl.layers.recurrent.config.SRUCellConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.recurrent.config SRUCellConfiguration]))

(defn ->sru-cell-configuration
  "Constructor."
  (^SRUCellConfiguration []
    (new SRUCellConfiguration )))

(defn args
  "returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^SRUCellConfiguration this]
    (-> this (.args))))

