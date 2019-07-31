(ns org.nd4j.linalg.cpu.nativecpu.blas.SparseCpuLevel2
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.blas SparseCpuLevel2]))

(defn ->sparse-cpu-level-2
  "Constructor."
  (^SparseCpuLevel2 []
    (new SparseCpuLevel2 )))

(defn scoomv
  "trans-a - `char`
  m - `int`
  values - `org.nd4j.linalg.api.buffer.DataBuffer`
  row-ind - `org.nd4j.linalg.api.buffer.DataBuffer`
  col-ind - `org.nd4j.linalg.api.buffer.DataBuffer`
  nnz - `int`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseCpuLevel2 this ^Character trans-a ^Integer m ^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer row-ind ^org.nd4j.linalg.api.buffer.DataBuffer col-ind ^Integer nnz ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.scoomv trans-a m values row-ind col-ind nnz x y))))

(defn dcoomv
  "trans-a - `char`
  m - `int`
  values - `org.nd4j.linalg.api.buffer.DataBuffer`
  row-ind - `org.nd4j.linalg.api.buffer.DataBuffer`
  col-ind - `org.nd4j.linalg.api.buffer.DataBuffer`
  nnz - `int`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseCpuLevel2 this ^Character trans-a ^Integer m ^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer row-ind ^org.nd4j.linalg.api.buffer.DataBuffer col-ind ^Integer nnz ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.dcoomv trans-a m values row-ind col-ind nnz x y))))

