(ns org.nd4j.linalg.compression.CompressionUtils
  "This class provides utility methods for Compression in ND4J"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.compression CompressionUtils]))

(defn ->compression-utils
  "Constructor."
  (^CompressionUtils []
    (new CompressionUtils )))

(defn *going-to-decompress
  "from - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`
  to - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx from ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx to]
    (CompressionUtils/goingToDecompress from to)))

(defn *going-to-compress
  "from - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`
  to - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx from ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx to]
    (CompressionUtils/goingToCompress from to)))

