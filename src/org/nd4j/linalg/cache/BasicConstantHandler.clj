(ns org.nd4j.linalg.cache.BasicConstantHandler
  "Basic No-Op abstraction for ConstantHandler"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cache BasicConstantHandler]))

(defn ->basic-constant-handler
  "Constructor."
  (^BasicConstantHandler []
    (new BasicConstantHandler )))

(defn move-to-constant-space
  "Description copied from interface: ConstantHandler

  data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `long`"
  (^Long [^BasicConstantHandler this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.moveToConstantSpace data-buffer))))

(defn relocate-constant-space
  "Description copied from interface: ConstantHandler

  data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BasicConstantHandler this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.relocateConstantSpace data-buffer))))

