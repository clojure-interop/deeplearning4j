(ns org.nd4j.linalg.cpu.nativecpu.SparseNDArrayCOO
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu SparseNDArrayCOO]))

(defn ->sparse-nd-array-coo
  "Constructor.

  values - `org.nd4j.linalg.api.buffer.DataBuffer`
  indices - `org.nd4j.linalg.api.buffer.DataBuffer`
  sparse-offsets - `long[]`
  flags - `int[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`
  shape - `long[]`"
  (^SparseNDArrayCOO [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices sparse-offsets flags hidden-dimensions ^Integer underlying-rank shape]
    (new SparseNDArrayCOO values indices sparse-offsets flags hidden-dimensions underlying-rank shape))
  (^SparseNDArrayCOO [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices ^org.nd4j.linalg.api.buffer.DataBuffer sparse-information shape]
    (new SparseNDArrayCOO values indices sparse-information shape))
  (^SparseNDArrayCOO [values indices shape]
    (new SparseNDArrayCOO values indices shape)))

