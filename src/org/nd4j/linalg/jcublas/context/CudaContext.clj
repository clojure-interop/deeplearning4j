(ns org.nd4j.linalg.jcublas.context.CudaContext
  "A higher level class for handling
 the different primitives around the cuda apis
 This being:
 streams (both old and new) as well as
 the cublas handles."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.context CudaContext]))

(defn ->cuda-context
  "Constructor.

  free - `boolean`"
  (^CudaContext [^Boolean free]
    (new CudaContext free))
  (^CudaContext []
    (new CudaContext )))

(defn *get-blas-context
  "Sets up a context with an old stream
  and a blas handle

  returns: the cuda context
  as setup for cublas usage - `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext []
    (CudaContext/getBlasContext )))

(defn sync-stream
  "Synchronizes on the new
  stream"
  ([^CudaContext this]
    (-> this (.syncStream))))

(defn attach-reference
  "ref - `org.nd4j.jita.allocator.garbage.GarbageResourceReference`"
  ([^CudaContext this ^org.nd4j.jita.allocator.garbage.GarbageResourceReference ref]
    (-> this (.attachReference ref))))

(defn sync-special-stream
  ""
  ([^CudaContext this]
    (-> this (.syncSpecialStream))))

(defn sync-solver-stream
  ""
  ([^CudaContext this]
    (-> this (.syncSolverStream))))

(defn init-old-stream
  "Initializes the old stream"
  ([^CudaContext this]
    (-> this (.initOldStream))))

(defn destroy
  "Deprecated.

  result-pointer - `org.nd4j.linalg.jcublas.CublasPointer`
  free-if-not-equal - `boolean`"
  ([^CudaContext this ^org.nd4j.linalg.jcublas.CublasPointer result-pointer ^Boolean free-if-not-equal]
    (-> this (.destroy result-pointer free-if-not-equal)))
  ([^CudaContext this]
    (-> this (.destroy))))

(defn init-stream
  "Initializes the stream"
  ([^CudaContext this]
    (-> this (.initStream))))

(defn finish-blas-operation
  "Finishes a blas operation
  and destroys this context"
  ([^CudaContext this]
    (-> this (.finishBlasOperation))))

(defn associate-handle
  "Associates
  the handle on this context
  to the given stream"
  ([^CudaContext this]
    (-> this (.associateHandle))))

(defn init-handle
  "Initializes a handle and
  associates with the given stream.
  initOldStream() should be called first"
  ([^CudaContext this]
    (-> this (.initHandle))))

(defn sync-old-stream
  "Synchronizes
  on the old stream"
  ([^CudaContext this]
    (-> this (.syncOldStream)))
  ([^CudaContext this ^Boolean sync-cu-blas]
    (-> this (.syncOldStream sync-cu-blas))))

(defn sync-cublas-stream
  ""
  ([^CudaContext this]
    (-> this (.syncCublasStream))))

