package database;

public class CriarFunction {
    public static void criar(Statement stmt) throws SQLException {
        stmt.executeUpdate(
            "CREATE PROCEDURE calcular_idade (IN p_id_cliente INT)" +
            "BEGIN" +
            "DECLARE data_atual = DATE;" +
            "DECLARE idade = 0;" +
            "SELECT FROM Cliente AS c WHERE c.id = p_id_cliente " +
            "SET idade = data_atual - c.dataNasc" +
            "RETURNS idade" +
            "END"
        );
    }
}

"""CREATE FUNCTION Verificar_dias(dia DATE)
RETURNS BOOLEAN

BEGIN
    DECLARE dia_Atual DATE;
    DECLARE tempo INT;

    SET dia_Atual = CURDATE();
    SET tempo = DATEDIFF(dia_Atual, dia);

    IF tempo > 100 THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
END""";