package com.weigreen.poler;

/**
 * Created by wind on 2013/6/6.
 */
public class TFHBridgeDataRoom implements java.io.Serializable
{
    private final String COMMAND;
    private final short INITIAL_PLAYER_NUMBER;
    private final short NOW_PLAYER_NUMBER;
    private final short CARD_ID;
    private final short EASTERN_HEAP; // east and west player's total heaps
    private final short NORTHERN_HEAP; // north and south player's total heaps

    public TFHBridgeDataRoom(String command, short initialPlayerNumber, short nowPlayerNumber, short cardId, short easternHeap, short northernHeap)
    {
        this.COMMAND = command;
        this.INITIAL_PLAYER_NUMBER = initialPlayerNumber;
        this.NOW_PLAYER_NUMBER = nowPlayerNumber;
        this.CARD_ID = cardId;
        this.EASTERN_HEAP = easternHeap;
        this.NORTHERN_HEAP = northernHeap;
    }

    public String getCommand()
    {
        return this.COMMAND;
    }

    public short getInitialPlayerNumber()
    {
        return this.INITIAL_PLAYER_NUMBER;
    }

    public short getNowPlayerNumber()
    {
        return this.NOW_PLAYER_NUMBER;
    }

    public short getCardId()
    {
        return this.CARD_ID;
    }

    public short getEasternHeap()
    {
        return this.EASTERN_HEAP;
    }

    public short getNorthernHeap()
    {
        return this.NORTHERN_HEAP;
    }

}
