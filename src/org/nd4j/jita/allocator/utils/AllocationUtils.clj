(ns org.nd4j.jita.allocator.utils.AllocationUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.utils AllocationUtils]))

(defn ->allocation-utils
  "Constructor."
  (^AllocationUtils []
    (new AllocationUtils )))

(defn *get-required-memory
  "shape - `org.nd4j.jita.allocator.impl.AllocationShape`

  returns: `long`"
  (^Long [^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (AllocationUtils/getRequiredMemory shape)))

(defn *get-element-size
  "shape - `org.nd4j.jita.allocator.impl.AllocationShape`

  returns: `int`"
  (^Integer [^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (AllocationUtils/getElementSize shape)))

(defn *build-allocation-shape
  "This method returns AllocationShape for specific array, that takes in account its real shape: offset, length, etc

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.jita.allocator.impl.AllocationShape`"
  (^org.nd4j.jita.allocator.impl.AllocationShape [^org.nd4j.linalg.api.ndarray.INDArray array]
    (AllocationUtils/buildAllocationShape array)))

(defn *get-byte-offset
  "This method returns byte offset based on AllocationShape

  shape - `org.nd4j.jita.allocator.impl.AllocationShape`

  returns: `long`"
  (^Long [^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (AllocationUtils/getByteOffset shape)))

(defn *get-pointers-buffer
  "pointers - `long[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [pointers]
    (AllocationUtils/getPointersBuffer pointers)))

