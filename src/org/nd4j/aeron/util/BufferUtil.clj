(ns org.nd4j.aeron.util.BufferUtil
  "Minor ByteBuffer utils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.aeron.util BufferUtil]))

(defn ->buffer-util
  "Constructor."
  (^BufferUtil []
    (new BufferUtil )))

(defn *concat
  "Merge all byte buffers together

  buffers - the bytebuffers to merge - `java.nio.ByteBuffer[]`
  over-all-capacity - the capacity of themerged bytebuffer - `int`

  returns: the merged byte buffer - `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [buffers ^Integer over-all-capacity]
    (BufferUtil/concat buffers over-all-capacity))
  (^java.nio.ByteBuffer [buffers]
    (BufferUtil/concat buffers)))

