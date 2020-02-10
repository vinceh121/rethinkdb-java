// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/ast/Binary.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.exc.ReqlDriverError;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;

import com.rethinkdb.net.Converter;
import org.jetbrains.annotations.Nullable;

public class Binary extends ReqlExpr {

    @Nullable byte[] b64Data;
    public Binary(byte[] bytes){
        this(new Arguments());
        b64Data = bytes;
    }
    public Binary(Object arg) {
        this(new Arguments(arg), null);
    }
    public Binary(Arguments args){
        this(args, null);
    }
    public Binary(Arguments args, OptArgs optargs) {
        this(TermType.BINARY, args, optargs);
    }
    protected Binary(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }


    @Override
    public Object build(){
        if(b64Data != null){
            return Converter.toBinary(b64Data);
        }else{
            return super.build();
        }
    }
}
