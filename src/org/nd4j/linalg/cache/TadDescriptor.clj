(ns org.nd4j.linalg.cache.TadDescriptor
  "This is utility class, made to compare TADs for caching purposes.
 Idea: for any given INDArray with any specific shape,
 TAD for specific dimension will always be the same.
 So it can be reused as much as we want.
 Of note here is that when used as a key,
 we preserve immutability of the shape buffer
 in the ndarray by copying the values with
 dataBufferToArray(DataBuffer)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cache TadDescriptor]))

(defn ->tad-descriptor
  "Constructor.

  Pass in an ndarray to get the databuffer
  and the appropriate dimensions

  array - the array to pass into get the shape info from - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimensions for the TAD - `int[]`"
  (^TadDescriptor [^org.nd4j.linalg.api.ndarray.INDArray array dimension]
    (new TadDescriptor array dimension)))

(defn *data-buffer-to-array
  "Obtain the values from the shape buffer
  for the array

  buffer - the buffer to get the values from - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: the int array version of this data buffer - `long[]`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (TadDescriptor/dataBufferToArray buffer)))

