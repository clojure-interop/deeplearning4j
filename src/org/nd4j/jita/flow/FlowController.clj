(ns org.nd4j.jita.flow.FlowController
  "Interface describing flow controller."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.flow FlowController]))

(defn synchronize-to-host
  "This method ensures, that all asynchronous operations on referenced AllocationPoint are finished, and host memory state is up-to-date

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^FlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.synchronizeToHost point))))

(defn register-action
  "This method is called after operation was executed

  context - `org.nd4j.linalg.jcublas.context.CudaContext`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^FlowController this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerAction context result operands))))

(defn wait-till-released
  "point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^FlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.waitTillReleased point))))

(defn wait-till-finished
  "This method ensures, that all asynchronous operations on referenced AllocationPoint are finished

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^FlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.waitTillFinished point))))

(defn get-events-provider
  "returns: `org.nd4j.jita.concurrency.EventsProvider`"
  (^org.nd4j.jita.concurrency.EventsProvider [^FlowController this]
    (-> this (.getEventsProvider))))

(defn prepare-action
  "This method is called before operation was executed

  result - `org.nd4j.linalg.api.ndarray.INDArray`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^FlowController this ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.prepareAction result operands))))

(defn init
  "allocator - `org.nd4j.jita.allocator.Allocator`"
  ([^FlowController this ^org.nd4j.jita.allocator.Allocator allocator]
    (-> this (.init allocator))))

(defn commit-transfer
  "This method should be called after memcpy operations, to control their flow.

  stream-used - `org.nd4j.jita.allocator.pointers.cuda.cudaStream_t`"
  ([^FlowController this ^org.nd4j.jita.allocator.pointers.cuda.cudaStream_t stream-used]
    (-> this (.commitTransfer stream-used))))

(defn prepare-action-all-write
  "operands - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^FlowController this ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.prepareActionAllWrite operands))))

(defn synchronize-to-device
  "This method ensures, that all asynchronous operations on referenced AllocationPoint are finished, and device memory state is up-to-date

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^FlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.synchronizeToDevice point))))

(defn register-action-all-write
  "context - `org.nd4j.linalg.jcublas.context.CudaContext`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^FlowController this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerActionAllWrite context operands))))

