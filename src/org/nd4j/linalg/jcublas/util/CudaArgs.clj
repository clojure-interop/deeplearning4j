(ns org.nd4j.linalg.jcublas.util.CudaArgs
  "Handles conversion of
 arguments passed to jcuda
 to their proper primitives
 when invoked with pointers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.util CudaArgs]))

(defn *get-module-name-for
  "For invoking a cuda kernel
  this returns the module opName for the given op

  op - the op to get the module opName for - `org.nd4j.linalg.api.ops.Op`

  returns: the module opName for the given op - `java.lang.String`"
  (^java.lang.String [^org.nd4j.linalg.api.ops.Op op]
    (CudaArgs/getModuleNameFor op)))

(defn *get-op-code
  "op - `org.nd4j.linalg.api.ops.Op`

  returns: `int`"
  (^Integer [^org.nd4j.linalg.api.ops.Op op]
    (CudaArgs/getOpCode op)))

(defn *convert-m-pto-cores
  "Returns number of SMs, based on device compute capability and number of processors.

  cc-major - `int`
  cc-minor - `int`
  number-of-processors - `int`

  returns: `int`"
  (^Integer [^Integer cc-major ^Integer cc-minor ^Integer number-of-processors]
    (CudaArgs/convertMPtoCores cc-major cc-minor number-of-processors)))

(defn *args-and-reference
  "context - `org.nd4j.linalg.jcublas.context.CudaContext`
  kernel-params - `java.lang.Object`

  returns: `org.nd4j.linalg.jcublas.util.CudaArgs$ArgsAndReferences`"
  (^org.nd4j.linalg.jcublas.util.CudaArgs$ArgsAndReferences [^org.nd4j.linalg.jcublas.context.CudaContext context ^java.lang.Object kernel-params]
    (CudaArgs/argsAndReference context kernel-params)))

