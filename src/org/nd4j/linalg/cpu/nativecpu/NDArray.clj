(ns org.nd4j.linalg.cpu.nativecpu.NDArray
  "NDArray: (think numpy)

 A few things of note.

 An NDArray can have any number of dimensions.

 An NDArray is accessed via strides.

 Strides are how to index over
 a contiguous block of data.

 This block of data has 2 orders(as of right now):
 fortran and c"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu NDArray]))

(defn ->nd-array
  "Constructor.

  Construct an ndarray of the specified shape, with optional initialization

  shape - the shape of the ndarray - `int[]`
  stride - the stride of the ndarray - `int[]`
  offset - the desired offset - `long`
  ordering - the ordering of the ndarray - `char`
  initialize - Whether to initialize the INDArray. If true: initialize. If false: don't. - `boolean`"
  (^NDArray [shape stride ^Long offset ^Character ordering ^Boolean initialize]
    (new NDArray shape stride offset ordering initialize))
  (^NDArray [shape stride ^Long offset ^Character ordering]
    (new NDArray shape stride offset ordering))
  (^NDArray [data shape ^Character ordering]
    (new NDArray data shape ordering))
  (^NDArray [data shape]
    (new NDArray data shape))
  (^NDArray [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (new NDArray buffer))
  (^NDArray []
    (new NDArray )))

(defn unsafe-duplication
  "Description copied from interface: INDArray

  blocking - `boolean`

  returns: Unsafe duplicate of array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArray this ^Boolean blocking]
    (-> this (.unsafeDuplication blocking)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArray this]
    (-> this (.unsafeDuplication))))

