(ns org.nd4j.linalg.jcublas.JCusparseNDArrayCOO
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas JCusparseNDArrayCOO]))

(defn ->j-cusparse-nd-array-coo
  "Constructor.

  values - `org.nd4j.linalg.api.buffer.DataBuffer`
  indices - `org.nd4j.linalg.api.buffer.DataBuffer`
  sparse-offsets - `long[]`
  flags - `int[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`
  shape - `long[]`"
  (^JCusparseNDArrayCOO [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices sparse-offsets flags hidden-dimensions ^Integer underlying-rank shape]
    (new JCusparseNDArrayCOO values indices sparse-offsets flags hidden-dimensions underlying-rank shape))
  (^JCusparseNDArrayCOO [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices ^org.nd4j.linalg.api.buffer.DataBuffer sparse-information shape]
    (new JCusparseNDArrayCOO values indices sparse-information shape))
  (^JCusparseNDArrayCOO [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices shape]
    (new JCusparseNDArrayCOO values indices shape)))

