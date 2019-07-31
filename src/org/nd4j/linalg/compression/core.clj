(ns org.nd4j.linalg.compression.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.nd4j.linalg.compression.AbstractStorage])
(require '[org.nd4j.linalg.compression.BasicNDArrayCompressor])
(require '[org.nd4j.linalg.compression.CompressedDataBuffer])
(require '[org.nd4j.linalg.compression.CompressionAlgorithm])
(require '[org.nd4j.linalg.compression.CompressionDescriptor])
(require '[org.nd4j.linalg.compression.CompressionType])
(require '[org.nd4j.linalg.compression.CompressionUtils])
(require '[org.nd4j.linalg.compression.NDArrayCompressor])
(require '[org.nd4j.linalg.compression.ThresholdCompression])
