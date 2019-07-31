(ns org.nd4j.linalg.jcublas.buffer.AddressRetriever
  "Address retriever
 for a data buffer (both on host and device)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer AddressRetriever]))

(defn ->address-retriever
  "Constructor."
  (^AddressRetriever []
    (new AddressRetriever )))

(defn *retrieve-device-address
  "Retrieves the device pointer
  for the given data buffer

  buffer - the buffer to get the deviceaddress for - `org.nd4j.linalg.api.buffer.DataBuffer`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`

  returns: the device address for the given
  data buffer - `long`"
  (^Long [^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (AddressRetriever/retrieveDeviceAddress buffer context)))

(defn *retrieve-host-address
  "Returns the host address

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `long`"
  (^Long [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (AddressRetriever/retrieveHostAddress buffer)))

(defn *retrieve-device-pointer
  "Retrieves the device pointer
  for the given data buffer

  buffer - the buffer to get the deviceaddress for - `org.nd4j.linalg.api.buffer.DataBuffer`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`

  returns: the device pointer for the given
  data buffer - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (AddressRetriever/retrieveDevicePointer buffer context)))

(defn *retrieve-host-pointer
  "Returns the host pointer

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (AddressRetriever/retrieveHostPointer buffer)))

