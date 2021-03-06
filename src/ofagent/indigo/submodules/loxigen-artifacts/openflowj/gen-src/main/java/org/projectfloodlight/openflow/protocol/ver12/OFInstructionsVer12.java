// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import java.util.List;


public class OFInstructionsVer12 implements OFInstructions {
    public final static OFInstructionsVer12 INSTANCE = new OFInstructionsVer12();




    public OFInstructionApplyActions.Builder buildApplyActions() {
        return new OFInstructionApplyActionsVer12.Builder();
    }
    public OFInstructionApplyActions applyActions(List<OFAction> actions) {
        return new OFInstructionApplyActionsVer12(
                actions
                    );
    }

    public OFInstructionClearActions clearActions() {
        return OFInstructionClearActionsVer12.INSTANCE;
    }

    public OFInstructionGotoTable.Builder buildGotoTable() {
        return new OFInstructionGotoTableVer12.Builder();
    }
    public OFInstructionGotoTable gotoTable(TableId tableId) {
        return new OFInstructionGotoTableVer12(
                tableId
                    );
    }

    public OFInstructionWriteActions.Builder buildWriteActions() {
        return new OFInstructionWriteActionsVer12.Builder();
    }
    public OFInstructionWriteActions writeActions(List<OFAction> actions) {
        return new OFInstructionWriteActionsVer12(
                actions
                    );
    }

    public OFInstructionWriteMetadata.Builder buildWriteMetadata() {
        return new OFInstructionWriteMetadataVer12.Builder();
    }
    public OFInstructionWriteMetadata writeMetadata(U64 metadata, U64 metadataMask) {
        return new OFInstructionWriteMetadataVer12(
                metadata,
                      metadataMask
                    );
    }

    public OFInstructionBsnArpOffload bsnArpOffload() {
        throw new UnsupportedOperationException("OFInstructionBsnArpOffload not supported in version 1.2");
    }

    public OFInstructionBsnDhcpOffload bsnDhcpOffload() {
        throw new UnsupportedOperationException("OFInstructionBsnDhcpOffload not supported in version 1.2");
    }

    public OFInstructionBsnDisableSplitHorizonCheck bsnDisableSplitHorizonCheck() {
        throw new UnsupportedOperationException("OFInstructionBsnDisableSplitHorizonCheck not supported in version 1.2");
    }

    public OFInstructionBsnDisableSrcMacCheck bsnDisableSrcMacCheck() {
        throw new UnsupportedOperationException("OFInstructionBsnDisableSrcMacCheck not supported in version 1.2");
    }

    public OFInstructionMeter.Builder buildMeter() {
        throw new UnsupportedOperationException("OFInstructionMeter not supported in version 1.2");
    }
    public OFInstructionMeter meter(long meterId) {
        throw new UnsupportedOperationException("OFInstructionMeter not supported in version 1.2");
    }

    public OFMessageReader<OFInstruction> getReader() {
        return OFInstructionVer12.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_12;
    }
}
