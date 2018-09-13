// automatically generated by the FlatBuffers compiler, do not modify

package herddb.proto.flatbuf;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Request extends Table {
  public static Request getRootAsRequest(ByteBuffer _bb) { return getRootAsRequest(_bb, new Request()); }
  public static Request getRootAsRequest(ByteBuffer _bb, Request obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Request __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public byte type() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public String mech() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer mechAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer mechInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public byte token(int j) { int o = __offset(10); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int tokenLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer tokenAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer tokenInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public byte tableSpace(int j) { int o = __offset(12); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int tableSpaceLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer tableSpaceAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer tableSpaceInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public long tx() { int o = __offset(14); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public byte query(int j) { int o = __offset(16); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int queryLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer queryAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer queryInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }
  public byte txCommand() { int o = __offset(18); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean returnValues() { int o = __offset(20); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public AnyValueList params() { return params(new AnyValueList()); }
  public AnyValueList params(AnyValueList obj) { int o = __offset(22); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public AnyValueList batchParams(int j) { return batchParams(new AnyValueList(), j); }
  public AnyValueList batchParams(AnyValueList obj, int j) { int o = __offset(24); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int batchParamsLength() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public byte scannerId(int j) { int o = __offset(26); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int scannerIdLength() { int o = __offset(26); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer scannerIdAsByteBuffer() { return __vector_as_bytebuffer(26, 1); }
  public ByteBuffer scannerIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 26, 1); }
  public long maxRows() { int o = __offset(28); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public int fetchSize() { int o = __offset(30); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public byte dumpId(int j) { int o = __offset(32); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int dumpIdLength() { int o = __offset(32); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer dumpIdAsByteBuffer() { return __vector_as_bytebuffer(32, 1); }
  public ByteBuffer dumpIdInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 32, 1); }
  public boolean includeTransactionLog() { int o = __offset(34); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public long dumpLedgerId() { int o = __offset(36); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long dumpOffset() { int o = __offset(38); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public TxLogEntry dumpTxLogEntries(int j) { return dumpTxLogEntries(new TxLogEntry(), j); }
  public TxLogEntry dumpTxLogEntries(TxLogEntry obj, int j) { int o = __offset(40); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int dumpTxLogEntriesLength() { int o = __offset(40); return o != 0 ? __vector_len(o) : 0; }
  public String command() { int o = __offset(42); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer commandAsByteBuffer() { return __vector_as_bytebuffer(42, 1); }
  public ByteBuffer commandInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 42, 1); }
  public byte tableName(int j) { int o = __offset(44); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int tableNameLength() { int o = __offset(44); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer tableNameAsByteBuffer() { return __vector_as_bytebuffer(44, 1); }
  public ByteBuffer tableNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 44, 1); }
  public TableDefinition tableDefinition() { return tableDefinition(new TableDefinition()); }
  public TableDefinition tableDefinition(TableDefinition obj) { int o = __offset(46); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public IndexDefinition indexesDefinition(int j) { return indexesDefinition(new IndexDefinition(), j); }
  public IndexDefinition indexesDefinition(IndexDefinition obj, int j) { int o = __offset(48); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int indexesDefinitionLength() { int o = __offset(48); return o != 0 ? __vector_len(o) : 0; }
  public long estimatedSize() { int o = __offset(50); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public KeyValue rawDataChunk(int j) { return rawDataChunk(new KeyValue(), j); }
  public KeyValue rawDataChunk(KeyValue obj, int j) { int o = __offset(52); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int rawDataChunkLength() { int o = __offset(52); return o != 0 ? __vector_len(o) : 0; }
  public KeyValue map(int j) { return map(new KeyValue(), j); }
  public KeyValue map(KeyValue obj, int j) { int o = __offset(54); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int mapLength() { int o = __offset(54); return o != 0 ? __vector_len(o) : 0; }

  public static int createRequest(FlatBufferBuilder builder,
      long id,
      byte type,
      int mechOffset,
      int tokenOffset,
      int tableSpaceOffset,
      long tx,
      int queryOffset,
      byte txCommand,
      boolean returnValues,
      int paramsOffset,
      int batchParamsOffset,
      int scannerIdOffset,
      long maxRows,
      int fetchSize,
      int dumpIdOffset,
      boolean includeTransactionLog,
      long dumpLedgerId,
      long dumpOffset,
      int dumpTxLogEntriesOffset,
      int commandOffset,
      int tableNameOffset,
      int tableDefinitionOffset,
      int indexesDefinitionOffset,
      long estimatedSize,
      int rawDataChunkOffset,
      int mapOffset) {
    builder.startObject(26);
    Request.addEstimatedSize(builder, estimatedSize);
    Request.addDumpOffset(builder, dumpOffset);
    Request.addDumpLedgerId(builder, dumpLedgerId);
    Request.addMaxRows(builder, maxRows);
    Request.addTx(builder, tx);
    Request.addId(builder, id);
    Request.addMap(builder, mapOffset);
    Request.addRawDataChunk(builder, rawDataChunkOffset);
    Request.addIndexesDefinition(builder, indexesDefinitionOffset);
    Request.addTableDefinition(builder, tableDefinitionOffset);
    Request.addTableName(builder, tableNameOffset);
    Request.addCommand(builder, commandOffset);
    Request.addDumpTxLogEntries(builder, dumpTxLogEntriesOffset);
    Request.addDumpId(builder, dumpIdOffset);
    Request.addFetchSize(builder, fetchSize);
    Request.addScannerId(builder, scannerIdOffset);
    Request.addBatchParams(builder, batchParamsOffset);
    Request.addParams(builder, paramsOffset);
    Request.addQuery(builder, queryOffset);
    Request.addTableSpace(builder, tableSpaceOffset);
    Request.addToken(builder, tokenOffset);
    Request.addMech(builder, mechOffset);
    Request.addIncludeTransactionLog(builder, includeTransactionLog);
    Request.addReturnValues(builder, returnValues);
    Request.addTxCommand(builder, txCommand);
    Request.addType(builder, type);
    return Request.endRequest(builder);
  }

  public static void startRequest(FlatBufferBuilder builder) { builder.startObject(26); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0L); }
  public static void addType(FlatBufferBuilder builder, byte type) { builder.addByte(1, type, 0); }
  public static void addMech(FlatBufferBuilder builder, int mechOffset) { builder.addOffset(2, mechOffset, 0); }
  public static void addToken(FlatBufferBuilder builder, int tokenOffset) { builder.addOffset(3, tokenOffset, 0); }
  public static int createTokenVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startTokenVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addTableSpace(FlatBufferBuilder builder, int tableSpaceOffset) { builder.addOffset(4, tableSpaceOffset, 0); }
  public static int createTableSpaceVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startTableSpaceVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addTx(FlatBufferBuilder builder, long tx) { builder.addLong(5, tx, 0L); }
  public static void addQuery(FlatBufferBuilder builder, int queryOffset) { builder.addOffset(6, queryOffset, 0); }
  public static int createQueryVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startQueryVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addTxCommand(FlatBufferBuilder builder, byte txCommand) { builder.addByte(7, txCommand, 0); }
  public static void addReturnValues(FlatBufferBuilder builder, boolean returnValues) { builder.addBoolean(8, returnValues, false); }
  public static void addParams(FlatBufferBuilder builder, int paramsOffset) { builder.addOffset(9, paramsOffset, 0); }
  public static void addBatchParams(FlatBufferBuilder builder, int batchParamsOffset) { builder.addOffset(10, batchParamsOffset, 0); }
  public static int createBatchParamsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBatchParamsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addScannerId(FlatBufferBuilder builder, int scannerIdOffset) { builder.addOffset(11, scannerIdOffset, 0); }
  public static int createScannerIdVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startScannerIdVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addMaxRows(FlatBufferBuilder builder, long maxRows) { builder.addLong(12, maxRows, 0L); }
  public static void addFetchSize(FlatBufferBuilder builder, int fetchSize) { builder.addInt(13, fetchSize, 0); }
  public static void addDumpId(FlatBufferBuilder builder, int dumpIdOffset) { builder.addOffset(14, dumpIdOffset, 0); }
  public static int createDumpIdVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startDumpIdVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addIncludeTransactionLog(FlatBufferBuilder builder, boolean includeTransactionLog) { builder.addBoolean(15, includeTransactionLog, false); }
  public static void addDumpLedgerId(FlatBufferBuilder builder, long dumpLedgerId) { builder.addLong(16, dumpLedgerId, 0L); }
  public static void addDumpOffset(FlatBufferBuilder builder, long dumpOffset) { builder.addLong(17, dumpOffset, 0L); }
  public static void addDumpTxLogEntries(FlatBufferBuilder builder, int dumpTxLogEntriesOffset) { builder.addOffset(18, dumpTxLogEntriesOffset, 0); }
  public static int createDumpTxLogEntriesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startDumpTxLogEntriesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addCommand(FlatBufferBuilder builder, int commandOffset) { builder.addOffset(19, commandOffset, 0); }
  public static void addTableName(FlatBufferBuilder builder, int tableNameOffset) { builder.addOffset(20, tableNameOffset, 0); }
  public static int createTableNameVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startTableNameVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addTableDefinition(FlatBufferBuilder builder, int tableDefinitionOffset) { builder.addOffset(21, tableDefinitionOffset, 0); }
  public static void addIndexesDefinition(FlatBufferBuilder builder, int indexesDefinitionOffset) { builder.addOffset(22, indexesDefinitionOffset, 0); }
  public static int createIndexesDefinitionVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startIndexesDefinitionVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addEstimatedSize(FlatBufferBuilder builder, long estimatedSize) { builder.addLong(23, estimatedSize, 0L); }
  public static void addRawDataChunk(FlatBufferBuilder builder, int rawDataChunkOffset) { builder.addOffset(24, rawDataChunkOffset, 0); }
  public static int createRawDataChunkVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRawDataChunkVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMap(FlatBufferBuilder builder, int mapOffset) { builder.addOffset(25, mapOffset, 0); }
  public static int createMapVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMapVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishRequestBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedRequestBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}
